package com.chaibytes.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        etEditText = (EditText) findViewById(R.id.editText);
        etEditText.setText((String)getIntent().getExtras().get(MainActivity.ITEM_TEXT));
    }

    public void onSaveItem(View view) {
        submitItem(etEditText.getText().toString());
    }

    private void submitItem(String editedItem) {
        Intent data = new Intent();
        data.putExtra(MainActivity.ITEM_TEXT, editedItem);
        setResult(RESULT_OK, data);
        finish();
    }
}
