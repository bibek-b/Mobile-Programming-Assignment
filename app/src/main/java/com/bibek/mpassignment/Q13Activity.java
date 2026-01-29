package com.bibek.mpassignment;


import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Q13Activity extends AppCompatActivity {

    LinearLayout layout;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q13);

        layout = findViewById(R.id.q13Layout);
        textView = findViewById(R.id.tv_view);

        // Register TextView for context menu
        registerForContextMenu(textView);
    }

    // Create Context Menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Select Background Color");
        menu.add(0, 1, 0, "Red");
        menu.add(0, 2, 0, "Yellow");
        menu.add(0, 3, 0, "Green");
        menu.add(0, 4, 0, "Black");
        menu.add(0, 5, 0, "Blue");
    }

    // Handle menu item selection
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case 1:
                layout.setBackgroundColor(Color.RED);
                break;
            case 2:
                layout.setBackgroundColor(Color.YELLOW);
                break;
            case 3:
                layout.setBackgroundColor(Color.GREEN);
                break;
            case 4:
                layout.setBackgroundColor(Color.BLACK);
                break;
            case 5:
                layout.setBackgroundColor(Color.BLUE);
                break;
        }
        return true;
    }
}
