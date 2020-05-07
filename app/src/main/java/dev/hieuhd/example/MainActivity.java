package dev.hieuhd.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import dev.hieuhd.itemviewsetting.ItemViewSetting;


/**
 * @author HieuHD
 */
public class MainActivity extends AppCompatActivity implements ItemViewSetting.onClickItemSetting {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ItemViewSetting itemViewSetting = findViewById(R.id.itemSetting1);
        ItemViewSetting itemViewSetting1 = findViewById(R.id.itemSetting2);
        ItemViewSetting itemViewSetting2 = findViewById(R.id.itemSetting3);
        ItemViewSetting itemViewSetting3 = findViewById(R.id.itemSetting4);
        ItemViewSetting itemViewSetting4 = findViewById(R.id.itemSetting5);
        itemViewSetting.setOnItemClick(this);
        itemViewSetting1.setOnItemClick(this);
        itemViewSetting2.setOnItemClick(this);
        itemViewSetting3.setOnItemClick(this);
        itemViewSetting4.setOnItemClick(this);
    }

    @Override
    public void onClickItem(View view, boolean isClick) {
        switch (view.getId()) {
            case R.id.itemSetting1:
                Toast.makeText(this, "itemSetting1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemSetting2:
                Toast.makeText(this, "itemSetting2: CheckBox value:"+isClick, Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemSetting3:
                Toast.makeText(this, "itemSetting3: Switch value: "+ isClick, Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemSetting4:
                Toast.makeText(this, "itemSetting4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemSetting5:
                Toast.makeText(this, "itemSetting5", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
