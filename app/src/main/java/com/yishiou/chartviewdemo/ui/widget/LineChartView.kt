package com.yishiou.chartviewdemo.ui.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View

class LineChartView: View {

    constructor(context: Context) : this(context, null, 0)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr) {
        initial(context, attrs, defStyleAttr)
    }

    private fun initial(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int) {

    }
}