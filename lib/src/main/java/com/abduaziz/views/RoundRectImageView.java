package com.abduaziz.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Created by abduaziz on 9/21/17.
 */

public class RoundRectImageView extends AppCompatImageView {

    private float roundRatio = 16f;
    private Path path;

    public RoundRectImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.RoundRectImageView, 0, 0);
        try {
            roundRatio = typedArray.getFloat(R.styleable.RoundRectImageView_roundRatio, 16f);
        } finally {
            typedArray.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (path == null) {
            path = new Path();
            path.addRoundRect(new RectF(0, 0, getWidth(), getHeight()), roundRatio * getWidth(), roundRatio * getHeight(), Path.Direction.CW);
        }
        canvas.save();
        canvas.clipPath(path);
        super.onDraw(canvas);
        canvas.restore();
    }
}
