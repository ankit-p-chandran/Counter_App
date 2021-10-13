# Counter_App
**Number Counting Android App.**


<img src="app/src/main/res/mipmap-xhdpi/ic_launcher_round.png" align="left"
width="100"
    hspace="10" vspace="10">

This is simple Counting App | The Counter is used for basically two things. Number one feature is there is a increment button and a decrement button to count by the user and there is reset button also.The count will display on the center of screen instently
<br>

## Preview
<img src="/Screenshot/Screenshot_2021-10-13-15-08-00-55_dfafa0d5319d3b7ee9c4fc826448c83e.jpg" width="300"  align="left">
<img src="/Screenshot/Screenshot_2021-10-13-15-08-07-14_dfafa0d5319d3b7ee9c4fc826448c83e.jpg" width="300" align="left">
<img src="/Screenshot/Screenshot_2021-10-13-15-08-00-55_dfafa0d5319d3b7ee9c4fc826448c83e.jpg" width="300" align="left"><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

## Implementation
Now the counter is based on `Onclick()` public method. This method will help us to count the number.

```@Override
            public void onClick(View v) {

                if(myValue <=0){
                    txCount.setText("0");
                }
                else{
                    myValue = myValue -1;
                    txCount.setText(myValue +"");
                }


            }
        });
```


## Follow me
<h4>Hey, while you're here why don't you think of following me for awesome projects like this, ah? <a href="https://github.com/ankit-p-chandran">Follow Me on my Profile!</a></h4>

<br>
Lets grab code with chai.

