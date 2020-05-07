# ItemViewSetting

A very simple Item setting view for Android

![1](https://user-images.githubusercontent.com/20981474/81314152-fb205500-90b2-11ea-867b-20a5c896a392.png)

# Usage

Step 1 : Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
	
Step 2 : Add the dependency

[![](https://jitpack.io/v/hieuhd1/ItemViewSetting.svg)](https://jitpack.io/#hieuhd1/ItemViewSetting/)

	dependencies {
	        implementation 'com.github.hieuhd1:ItemViewSetting:0.0.1'
	}


Step 3 : Add edittext to your xml layout.
      
      <dev.hieuhd.itemviewsetting.ItemViewSetting
        android:id="@+id/itemSetting1"
        app:description_item="ItemViewSetting 1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

	
	
# Custom Attributes

    
| Attributes | Format | Example |
| :---         |     :---      |          :--- |
| isVisible_CheckBox   | boolean     |  app:isVisible_CheckBox="true"    |
| isVisible_SwitchButton   | boolean     | app:isVisible_SwitchButton="true"      |   
| isVisible_RightIcon   | boolean     | app:isVisible_RightIcon="true"      | 
| isVisible_TextValue   | boolean     | app:isVisible_TextValue="true"      | 
| text_item_value   | string | app:text_item_value="Vietnamese"      | 
| isVisible_LineBottom   | boolean   | app:isVisible_LineBottom="true"      | 
| isVisible_LineTop   | boolean     | app:isVisible_LineTop="true"     | 
| description_item  | string     |         app:description_item="ItemViewSetting 2"      | 
| description_color   | color     | app:description_color="@color/colorAccent"      | 
| item_value_color   | color     | app:item_value_color="@color/colorPrimary"      | 
| item_checkbox_checked   | boolean     | app:item_checkbox_checked="true"      | 
| item_switch_checked   | boolean    |  app:item_switch_checked="true"      | 

 # Contact
 
 Feel free to contact for any question or bugs:
 
 * Email : hieuhd1003@gmail.com
 
 
# Licence

Copyright 2020 HieuHD

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
