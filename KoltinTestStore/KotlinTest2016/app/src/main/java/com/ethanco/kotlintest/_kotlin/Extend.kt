package com.ethanco.kotlintest._kotlin

import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * 我们可以为任何已存在的类添加新函数，相比我们工程中普遍存在的传统工具类，扩展函数更具可读性。
 * 函数是一级公民
 * Created by Zhk on 2016/11/7.
 */
fun AppCompatActivity.toast(message: String, duration: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, message, duration).show()
}

fun KotlinBean.sum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

fun KotlinBean.dec(arg1: Int, arg2: Int): Int = arg1 - arg2

