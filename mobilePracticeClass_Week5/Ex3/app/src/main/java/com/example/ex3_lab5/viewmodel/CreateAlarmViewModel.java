package com.example.ex3_lab5.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.ex3_lab5.data.AlarmRepository;
import com.example.ex3_lab5.model.Alarm;

public class CreateAlarmViewModel extends AndroidViewModel {
    private AlarmRepository alarmRepository;

    public CreateAlarmViewModel(@NonNull Application application) {
        super(application);

        alarmRepository = new AlarmRepository(application);
    }

    public void insert(Alarm alarm) {
        alarmRepository.insert(alarm);
    }
    public void update(Alarm alarm) {
        alarmRepository.update(alarm);
    }
}
