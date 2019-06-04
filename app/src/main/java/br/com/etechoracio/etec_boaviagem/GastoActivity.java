    package br.com.etechoracio.etec_boaviagem;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;

import java.util.Calendar;

import br.com.etechoracio.etec_boaviagem.enums.TipoGastoEnum;
import br.com.etechoracio.etec_boaviagem.utils.DateTimeUtils;

    public class GastoActivity extends AppCompatActivity {

    private Spinner spnTipoGasto;
    private Button  btnData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasto);

        spnTipoGasto = (Spinner) findViewById(R.id.spnTipoGasto);
        spnTipoGasto.setAdapter(getAdapterTipoGasto());
        btnData = findViewById(R.id.btnData);
    }

    private ArrayAdapter getAdapterTipoGasto(){
        return new ArrayAdapter<TipoGastoEnum>(this,
                                                R.layout.support_simple_spinner_dropdown_item,
                                                TipoGastoEnum.values());
    }


        private DatePickerDialog.OnDateSetListener data = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int ano, int mes, int dia) {
                btnData.setText(DateTimeUtils.formatDate(dia, mes + 1, ano));
            }
        };
        protected Dialog onCreateDialog(int id) {
            Calendar cal = Calendar.getInstance();
            int ano = cal.get(Calendar.YEAR);
            int mes = cal.get(Calendar.MONTH);
            int dia = cal.get(Calendar.DAY_OF_MONTH);

            switch (id) {
                case R.id.btnData:
                    return new DatePickerDialog(this, data, ano, mes, dia);
            }
            return null;
        }
        public void onSelecionarDataGasto(View view) {
            showDialog(view.getId());
        }
}
