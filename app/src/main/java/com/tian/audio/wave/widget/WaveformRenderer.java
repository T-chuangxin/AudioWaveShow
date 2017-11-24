package com.tian.audio.wave.widget;

import android.graphics.Canvas;

/**
 * 项目名称：AudioWaveShow
 * 类描述：
 * 创建人：TCX
 * 创建时间：2017/11/20 11:05
 * 修改人：TCX
 * 修改备注：
 */

public interface WaveformRenderer {

     void render(Canvas canvas, byte[] waveform);
}
