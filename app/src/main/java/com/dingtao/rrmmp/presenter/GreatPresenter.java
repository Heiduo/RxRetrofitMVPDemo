package com.dingtao.rrmmp.presenter;

import com.dingtao.rrmmp.core.DataCall;
import com.dingtao.rrmmp.core.http.IRequest;
import com.dingtao.rrmmp.core.http.NetworkManager;

import io.reactivex.Observable;

/**
 * @author dingtao
 * @date 2018/12/28 11:23
 * qq:1940870847
 */
public class GreatPresenter extends BasePresenter {

    public GreatPresenter(DataCall consumer) {
        super(consumer);
    }

    @Override
    protected Observable observable(Object... args) {
        IRequest iRequest = NetworkManager.instance().create(IRequest.class);
        return iRequest.addCircleGreat((String)args[0],(String)args[1],(long)args[2]);
    }


}
