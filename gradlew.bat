<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="Base.TextAppearance.AppCompat.Widget.ActionBar.Menu" parent="android:TextAppearance.Material.Widget.ActionBar.Menu"/>
    <style name="Base.TextAppearance.AppCompat.Widget.Button.Inverse" parent="android:TextAppearance.Material.Widget.Button.Inverse"/>
    <style name="Base.Theme.AppCompat" parent="Base.V23.Theme.AppCompat"/>
    <style name="Base.Theme.AppCompat.Light" parent="Base.V23.Theme.AppCompat.Light"/>
    <style name="Base.V23.Theme.AppCompat" parent="Base.V22.Theme.AppCompat">
        <!-- We can use the platform styles on API 23+ -->
        <item name="ratingBarStyleIndicator">?android:attr/ratingBarStyleIndicator</item>
        <item name="ratingBarStyleSmall">?android:attr/ratingBarStyleSmall</item>

        <!-- We can use the platform drawable on v23+ -->
        <item name="actionBarItemBackground">?android:attr/actionBarItemBackground</item>
        <!-- We can use the platform styles on v23+ -->
        <item name="actionMenuTextColor">?android:attr/actionMenuTextColor</item>
        <item name="actionMenuTextAppearance">?android:attr/actionMenuTextAppearance</item>

        <item name="controlBackground">@drawable/abc_control_background_material</item>
    </style>
    <style name="Base.V23.Theme.AppCompat.Light" parent="Base.V22.Theme.AppCompat.Light">
        <!-- We can use the platform styles on API 23+ -->
        <item name="ratingBarStyleIndicator">?android:attr/ratingBarStyleIndicator</item>
        <item name="ratingBarStyleSmall">?android:attr/ratingBarStyleSmall</item>

        <!-- We can use the platform drawable on v23+ -->
        <item name="actionBarItemBackground">?android:attr/actionBarItemBackground</item>
        <!-- We can use the platform styles on v23+ -->
        <item name="actionMenuTextColor">?android:attr/actionMenuTextColor</item>
        <item name="actionMenuTextAppearance">?android:attr/actionMenuTextAppearance</item>

        <item name="controlBackground">@drawable/abc_control_background_material</item>
    </style>
    <style name="Base.Widget.AppCompat.Button.Borderless.Colored" parent="android:Widget.Material.Button.Borderless.Colored"/>
    <style name="Base.Widget.AppCompat.Button.Colored" par