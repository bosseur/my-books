package com.suelengc.bookplan.view.commondialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    private DatePickerDialog.OnDateSetListener delegate;

    public static DatePickerFragment newInstance(DatePickerDialog.OnDateSetListener delegate) {
        DatePickerFragment datepicker = new DatePickerFragment();
        datepicker.delegate = delegate;
        return datepicker;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), delegate, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dat) {
        
    }
}