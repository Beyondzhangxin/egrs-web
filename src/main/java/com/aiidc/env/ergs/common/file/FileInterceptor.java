/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.file;

import java.io.Serializable;
import java.util.List;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import com.aiidc.env.ergs.common.file.util.FileUtil;
import com.aiidc.env.ergs.common.util.SpringContextUtil;

/**
 * @author wuwenjun
 *
 */
public class FileInterceptor extends EmptyInterceptor {
	private static FileService fileService;

	public FileInterceptor() {
		super();
		fileService = SpringContextUtil.getBean(FileService.class);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8672860901621138190L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.EmptyInterceptor#onSave(java.lang.Object,
	 * java.io.Serializable, java.lang.Object[], java.lang.String[],
	 * org.hibernate.type.Type[])
	 */
	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		List<String> fileFields = FileUtil.getFileFields(entity.getClass());
		if (!fileFields.isEmpty()) {
			for (int i = 0; i < propertyNames.length; i++) {
				if (fileFields.contains(propertyNames[i])) {
					fileService.addUse(String.valueOf(state[i]));
				}
			}
		}
		return super.onSave(entity, id, state, propertyNames, types);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.EmptyInterceptor#onFlushDirty(java.lang.Object,
	 * java.io.Serializable, java.lang.Object[], java.lang.Object[],
	 * java.lang.String[], org.hibernate.type.Type[])
	 */
	@Override
	public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types) {
		List<String> fileFields = FileUtil.getFileFields(entity.getClass());
		if (!fileFields.isEmpty()) {
			for (int i = 0; i < propertyNames.length; i++) {
				if (fileFields.contains(propertyNames[i])) {
					if (previousState[i] != null && currentState[i] != null
							&& !currentState[i].equals(previousState[i])) {
						fileService.addUse(String.valueOf(currentState[i]));
						fileService.deleteFile(String.valueOf(previousState[i]));
					}
				}
			}
		}
		return super.onFlushDirty(entity, id, currentState, previousState, propertyNames, types);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.EmptyInterceptor#onDelete(java.lang.Object,
	 * java.io.Serializable, java.lang.Object[], java.lang.String[],
	 * org.hibernate.type.Type[])
	 */
	@Override
	public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		List<String> fileFields = FileUtil.getFileFields(entity.getClass());
		if (!fileFields.isEmpty()) {
			for (int i = 0; i < propertyNames.length; i++) {
				if (fileFields.contains(propertyNames[i])) {
					fileService.deleteFile(String.valueOf(state[i]));
				}
			}
		}
		super.onDelete(entity, id, state, propertyNames, types);
	}

}
