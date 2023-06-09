package com.example.ex3_lab5.util;

import android.view.View;

import com.example.ex3_lab5.model.Alarm;

public interface OnToggleAlarmListener {
    void onToggle(Alarm alarm);
    void onDelete(Alarm alarm);
    void onItemClick(Alarm alarm, View view);
}
