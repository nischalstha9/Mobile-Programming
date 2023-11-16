package com.nischalstha9.lab13optionsmenu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;

public class main extends AppCompatActivity {
    private ActionMode mActionMode;
    TextView text;
    Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        text = (TextView) findViewById(R.id.text);
        btn = (Button) findViewById(R.id.PopUpMenuButton);
        registerForContextMenu(text);

        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (mActionMode != null) {
                    return false;
                }
                mActionMode = startSupportActionMode(mActionModeCallback);
                return true;
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu pmenu = new PopupMenu(main.this, btn);
                pmenu.getMenuInflater().inflate(R.menu.menu, pmenu.getMenu());
                pmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        Toast.makeText(main.this, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                pmenu.show();
            }
        });
    }


    private ActionMode.Callback mActionModeCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate(R.menu.menu, menu);
            mode.setTitle("Choose Action Menu Item");
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            if (item.getItemId() == R.id.settings) {
                text.setText("ContextAction: Settings");
                return true;
            } else if (item.getItemId() == R.id.history) {
                text.setText("ContextAction:History");
                return true;
            } else if (item.getItemId() == R.id.share) {
                text.setText("ContextAction:Share");
                return true;
            } else {
                //return onOptionsItemSelected(item);
                text.setText("ContextAction:I am Inevitable");
                return true;
            }
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
        }
    };

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("I am Floating Context Menu");
        getMenuInflater().inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.settings) {
            text.setText("ContextFLoating: Settings");
            return true;
        } else if (item.getItemId() == R.id.history) {
            text.setText("ContextFLoating:History");
            return true;
        } else if (item.getItemId() == R.id.share) {
            text.setText("ContextFLoating:Share");
            return true;
        } else {
            //return onOptionsItemSelected(item);
            text.setText("ContextFLoating:I am Inevitable");
            return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.settings) {
            text.setText("Options: Settings");
            return true;
        } else if (item.getItemId() == R.id.history) {
            text.setText("Options: History");
            return true;
        } else if (item.getItemId() == R.id.share) {
            text.setText("Options: Share");
            return true;
        } else {
            //return onOptionsItemSelected(item);
            text.setText("I am Inevitable");
            return true;
        }
    }
}
