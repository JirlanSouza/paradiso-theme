package com.paradizo;

import com.paradizo.theme.FileUtils;

public class ThemeParadizo {
    private String getCSSTheme() {
        return FileUtils.getResourceContents("theme.css");
    }
}