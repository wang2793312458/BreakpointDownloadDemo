package com.example.breakpointdownloaddemo;

/**
 * 创建日期：2017/3/4 on 20:29
 * 描述:
 * 作者:王小智 Administrator
 */

public class hellow {
    //你注意一下，onPreExecute只有在ProgressResponseBody的构造方法里会调用一次，
    // 而ProgressResponseBody是在getProgressClient()里构造的
    // ，ProgressDownloader的构造方法里又调用了getProgressClient()方法，
    // 所以解决方法就是把Demo中ProgressDownloader的构造从监听事件中提到onCreate方法中。
}
