package com.example.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * Created with IntelliJ IDEA.
 * User: marshal
 * Date: 13-4-1
 * Time: 下午2:45
 * To change this template use File | Settings | File Templates.
 */
public class MyWebView extends WebView{
    public MyWebView(Context context) {
        super(context);
    }

    public MyWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyWebView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
