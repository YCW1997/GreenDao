package com.yuan.studentdemo.utils;

import android.content.Context;
import android.util.Log;

import com.yuan.studentdemo.greendao.DaoManager;
import com.yuan.studentdemo.bean.StudentBean;
import com.yuan.studentdemo.greendao.StudentBeanDao;

import java.util.List;

/**
 * Created by Administrator on 2019/1/21 0021.
 */

public class StudentDaoUtils {

    private static StudentDaoUtils studentDaoUtils;
    public StudentBeanDao studentbeanDao;

    /**
     * 创建Student表实例
     */
    public StudentBeanDao getstudentbeanDao(){
        studentbeanDao = DaoManager.getInstance().getSession().getStudentBeanDao();
        return studentbeanDao;
    }

    /**
     * 创建单例
     */
    public static StudentDaoUtils getInstance() {
        if (studentDaoUtils == null) {
            studentDaoUtils = new StudentDaoUtils();
        }
        return studentDaoUtils;
    }
}
