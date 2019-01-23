package com.yuan.studentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yuan.studentdemo.bean.StudentBean;
import com.yuan.studentdemo.greendao.StudentBeanDao;
import com.yuan.studentdemo.utils.StudentDaoUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StudentBeanDao studentbeanDao= StudentDaoUtils.getInstance().getstudentbeanDao();
        StudentBean studentBean1=new StudentBean(1,"小明",20,"男");
        StudentBean studentBean2=new StudentBean(2,"小红",22,"女");
        StudentBean studentBean3=new StudentBean(3,"张三",21,"男");
        StudentBean studentBean4=new StudentBean(3,"张三",23,"女");

        studentbeanDao.insert(studentBean1);
        studentbeanDao.insert(studentBean2);
        studentbeanDao.insert(studentBean3);
        studentbeanDao.insert(studentBean4);
    }
}
