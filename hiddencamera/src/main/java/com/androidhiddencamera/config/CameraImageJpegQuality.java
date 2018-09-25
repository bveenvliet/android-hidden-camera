/*
 * Copyright 2017 Keval Patel.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.androidhiddencamera.config;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressWarnings("WeakerAccess")
public final class CameraImageJpegQuality {

    /**
     * 100 % image quality for .jpg/.jpeg.
     */
    public static final int QUALITY_JPEG_100 = 100;
    /**
     * 90 % image quality for .jpg/.jpeg.
     */
    public static final int QUALITY_JPEG_90 = 90;
    /**
     * 80 % image quality for .jpg/.jpeg.
     */
    public static final int QUALITY_JPEG_80 = 80;
    /**
     * 60 % image quality for .jpg/.jpeg.
     */
    public static final int QUALITY_JPEG_60 = 60;
    /**
     * 40 % image quality for .jpg/.jpeg.
     */
    public static final int QUALITY_JPEG_40 = 40;
    /**
     * 20 % image quality for .jpg/.jpeg.
     */
    public static final int QUALITY_JPEG_20 = 20;
    /**
     * 0 % image quality for .jpg/.jpeg.
     */
    public static final int QUALITY_JPEG_0 = 0;


    private CameraImageJpegQuality() {
        throw new RuntimeException("Cannot initialize CameraImageJpegQuality.");
    }

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({QUALITY_JPEG_100, QUALITY_JPEG_90, QUALITY_JPEG_80, QUALITY_JPEG_60, QUALITY_JPEG_40, QUALITY_JPEG_20, QUALITY_JPEG_0})
    public @interface SupportedImageQuality {

    }
}
