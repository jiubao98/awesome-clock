package com.plain.awesome_clock.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Base Fragment
 *
 * @author Plain
 * @date 2019-11-28 14:34
 */
open class BaseFragment : Fragment() {

    protected lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setInit()
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    private fun setInit(){
        initData()
        initView()
        setListener()
    }

    protected open fun initData(){

    }

    protected open fun initView(){

    }

    protected open fun setListener(){

    }


}