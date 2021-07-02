# Date-Picker
 A simple library to pick a date like IOS:
 
* DateTimePickerView: Support for the year, month, day, hour and other format.
* Support three linkage
* Set whether the linkage
* Set the cycle mode
* Support custom layout
* Support the item's divider settings.
* Support item spacing settings
* The time selector supports start and end date settings.
* Support for "year, month, day, hour, minute, second", "province, city, district" and other options of the unit(label) display, hide and customize.
* Support custom text, color, text size and other attribute.
* Item text length is too long, the text will be automatically scaled to item length, to avoid displaying incomplete problem
* Support Dialog mode.
* Support for custom settings container.



https://user-images.githubusercontent.com/75199100/124210484-206af080-db09-11eb-852b-17520ab8495c.mp4



<h2>How to use</h2>

<h3>1.Add the dependency：</h3>
 
 **step 1 :** Add it in your root build.gradle at the end of repositories:
 
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
 
 **setp 2 :** Add the dependency:
 
 	implementation 'com.github.PiyushMangukiya03:DatePicker:0.0.1'
 
 <h3>Maven</h3>
  
  	<dependency>
	    <groupId>com.github.PiyushMangukiya03</groupId>
	    <artifactId>DatePicker</artifactId>
	    <version>0.0.1</version>
	</dependency>
  
  
<h3>2.Add the following code in your Activity：</h3>
	
	 //DateTimePickerView
	    dateTimePickerView = new DateTimePickerView.Builder(this, new DateTimePickerView.OnTimeSelectListener() {
		@Override
		public void onTimeSelect(Date date,View v) {//Callback
		    yourTextView.setText(getTime(date));
		}
	    })
		    .build();
	    dateTimePickerView.show();
 
<h3> Customize Useage：</h3>
	
 	Calendar selectedDate = Calendar.getInstance();
        Calendar startDate = Calendar.getInstance();
        startDate.set(2013,0,1);
        Calendar endDate = Calendar.getInstance();
        endDate.set(2020,11,1);

        dateTimePickerView = new DateTimePickerView.Builder(this, new DateTimePickerView.OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date,View v) {//callback
                yourTextView.setText(getTime(date));
            }
        })     
                .setType(new boolean[]{false, false, false, true, true, false})   // day-month-year-hour-min-sec
                .setCancelText("Cancel")
                .setSubmitText("Sure")
                .setContentSize(18)
                .setTitleSize(20)
                .setTitleText("Title")
                .setOutSideCancelable(false)// default is true
                .isCyclic(true)// default is false
                .setTitleColor(Color.BLACK)
                .setSubmitColor(Color.BLUE)
                .setCancelColor(Color.BLUE)
                .setTitleBgColor(0xFF666666)//night mode
                .setBgColor(0xFF333333)//night mode
                .setRangDate(startDate,endDate)
                .setLabel("day","month","year","hours","mins","seconds")
                .build();
