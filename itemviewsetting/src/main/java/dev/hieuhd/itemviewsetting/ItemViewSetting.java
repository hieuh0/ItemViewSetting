package dev.hieuhd.itemviewsetting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * @author HieuHD
 */
public class ItemViewSetting extends LinearLayout {
    private CheckBox checkBox;
    private TextView tvDescriptionItem;
    private TextView tvItemValue;
    private Switch switchButton;
    private ImageView ivIconRight;
    private RelativeLayout rlItemSetting;
    private View lineTop;
    private View lineBottom;
    private onClickItemSetting listener;

    public ItemViewSetting(Context context) {
        super(context);
        initialize(null, 0);
    }

    public ItemViewSetting(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize(attrs, 0);
    }

    public ItemViewSetting(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(attrs, defStyleAttr);
    }

    public ItemViewSetting(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize(attrs, defStyleAttr);
    }

    private void initialize(AttributeSet attrs, int defStyleAttr) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_view, this, true);
        checkBox = view.findViewById(R.id.checkboxView);
        tvDescriptionItem = view.findViewById(R.id.tvDescriptionItem);
        tvItemValue = view.findViewById(R.id.tvItemValue);
        switchButton = view.findViewById(R.id.switchButton);
        ivIconRight = view.findViewById(R.id.ivIconRight);
        rlItemSetting = view.findViewById(R.id.rlItemSetting);
        lineBottom = view.findViewById(R.id.viewBottom);
        lineTop = view.findViewById(R.id.viewTop);

        TypedArray styleable = getContext().obtainStyledAttributes(
                attrs,
                R.styleable.itemViewSetting,
                defStyleAttr,
                0
        );

        boolean isVisibleCb = styleable.getBoolean(R.styleable.itemViewSetting_isVisible_CheckBox, false);
        boolean isVisibleSwitch = styleable.getBoolean(R.styleable.itemViewSetting_isVisible_SwitchButton, false);
        int colorItemValue = styleable.getColor(R.styleable.itemViewSetting_item_value_color, Color.parseColor("#FF1493"));
        int descriptionColor = styleable.getColor(R.styleable.itemViewSetting_description_color, Color.BLACK);
        String descriptionItem = styleable.getString(R.styleable.itemViewSetting_description_item);
        String itemValue = styleable.getString(R.styleable.itemViewSetting_text_item_value);
        boolean isVisibleItemValue = styleable.getBoolean(R.styleable.itemViewSetting_isVisible_TextValue, false);
        boolean isVisibleIconRight = styleable.getBoolean(R.styleable.itemViewSetting_isVisible_RightIcon, true);
        boolean cbIsChecked = styleable.getBoolean(R.styleable.itemViewSetting_item_checkbox_checked, false);
        boolean switchIsChecked = styleable.getBoolean(R.styleable.itemViewSetting_item_switch_checked, false);
        boolean isVisibleLineBottom = styleable.getBoolean(R.styleable.itemViewSetting_isVisible_LineBottom, true);
        boolean isVisibleLineTop = styleable.getBoolean(R.styleable.itemViewSetting_isVisible_LineTop, true);

        rlItemSetting.setOnClickListener(v -> {
            if (listener != null) {
                listener.onClickItem(this, false);
            }
        });
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (listener != null) {
                listener.onClickItem(this, checkBox.isChecked());
            }
        });

        switchButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (listener != null) {
                listener.onClickItem(this, switchButton.isChecked());
            }
        });

        setIsVisibleCheckBox(isVisibleCb);
        setIsVisibleSwitchButton(isVisibleSwitch);
        setColorItemValue(colorItemValue);
        setDescriptionItem(descriptionItem);
        setDescriptionColor(descriptionColor);
        setItemValue(itemValue);
        setIsVisibleTextValue(isVisibleItemValue);
        setIsVisibleIconRight(isVisibleIconRight);
        setCheckedCheckBox(cbIsChecked);
        setCheckedSwitch(switchIsChecked);
        setIsVisibleTopLine(isVisibleLineTop);
        setIsVisibleBottomLine(isVisibleLineBottom);
        styleable.recycle();
    }
    public void setIsVisibleTopLine(boolean isVisible) {
        lineTop.setVisibility((isVisible) ? View.VISIBLE : View.GONE);
    }

    public void setIsVisibleBottomLine(boolean isVisible) {
        lineBottom.setVisibility((isVisible) ? View.VISIBLE : View.GONE);
    }

    public void setCheckedCheckBox(boolean isChecked) {
        checkBox.setChecked(isChecked);
    }

    public void setCheckedSwitch(boolean isChecked) {
        switchButton.setChecked(isChecked);
    }

    public void setOnItemClick(onClickItemSetting onItemClick) {
        this.listener = onItemClick;
    }

    public void setIsVisibleCheckBox(boolean isVisible) {
        checkBox.setVisibility((isVisible) ? View.VISIBLE : View.GONE);
    }

    public void setIsVisibleSwitchButton(boolean isVisible) {
        switchButton.setVisibility((isVisible) ? View.VISIBLE : View.GONE);
    }

    public void setIsVisibleTextValue(boolean isVisible) {
        tvItemValue.setVisibility((isVisible) ? View.VISIBLE : View.GONE);
    }

    public void setIsVisibleIconRight(boolean isVisible) {
        ivIconRight.setVisibility((isVisible) ? View.VISIBLE : View.GONE);
    }

    public void setColorItemValue(int color) {
        tvItemValue.setTextColor(color);
    }

    public void setItemValue(String text) {
        tvItemValue.setText(text);
    }

    public void setDescriptionItem(String text) {
        tvDescriptionItem.setText(text);
    }

    public void setDescriptionColor(int color) {
        tvDescriptionItem.setTextColor(color);
    }


    public interface onClickItemSetting {
        void onClickItem(View view, boolean isClick);
    }
}
