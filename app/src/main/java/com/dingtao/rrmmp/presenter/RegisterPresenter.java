package com.dingtao.rrmmp.presenter;

import com.dingtao.rrmmp.core.WDPresenter;
import com.dingtao.rrmmp.core.DataCall;
import com.dingtao.rrmmp.core.http.IAppRequest;

import io.reactivex.Observable;

/**
 * @author dingtao
 * @date 2018/12/28 11:23
 * qq:1940870847
 */
public class RegisterPresenter extends WDPresenter<IAppRequest> {

    public RegisterPresenter(DataCall dataCall) {
        super(dataCall);
    }

    @Override
    protected Observable getModel(Object... args) {
        return iRequest.register((String)args[0],(String)args[1]);
    }


}
