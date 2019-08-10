/******The Following program is for determining which family paid a greater tip than the other****
  so we had to find their respective averages and compare them
*/
//creatong the first object
var john = {
	fullName: 'Johm Smith',
	age: 26,
	bills: [124,48,268,180,42],
	// creating the method to calculate the tip of the first object
    calcTips: function () {
    	this.tips = [];
    	this.amountPayed = [];
    	for (var i = 0; i < this.bills.length; i++) {
    		var percentage;
    		var bill = this.bills [i] ;

    		if (bill < 50) {
    			percentage = 0.2;
    		}else if (bill > 50 && bill < 200) {
    			percentage = 0.15;
    		}else {
    			percentage = 0.1;
    		}
    		this.tips [i] = bill * percentage;
    		this.amountPayed [i] = bill + bill * percentage;
    	}
    }
}
//creating the second object
var mark = {
	fullName: 'Mark Bishanga',
	age: 24,
	bills: [77,375,110,45],
// creating the method to calculate the second tip
	calcTips: function () {
		this.tips = [];
		this.amountPayed = [];
		for (var i = 0; i < this.bills.length; i++) {
			var percentage;
	        var bill = this.bills [i];

	        if (bill < 100) {
	        	percentage = 0.2;
	        }else if (bill > 100 && bill < 300) {
	        	percentage = 0.1;
	        }else {
	        	percentage = 0.25;
	        }
	        this.tips [i] = bill * percentage;
	        this.amountPayed [i] = bill + bill * percentage;
   	}
  }
}
// creating the method to calculate the avarages of any method
   function calcAverage (tips) {
   	    var sum = 0;
   	    for (var i = 0; i < tips.length; i++) {
   	    	sum = sum + tips[i];
   	    }
   	    // calculating the Averages
   	    return sum / tips.length;
   }
 //calling each object's nethod
john.calcTips ();
mark.calcTips ();

//creating the properties average for each object
john.average = calcAverage (john.tips);
mark.average = calcAverage (mark.tips);
console.log (john,mark);
// finally setting the condition to determine our optimum solution
if (john.average >  mark.average) {
	console.log('John\'s Family paid a greater tip of $'+ john.average);
}else if (mark.average > john.average) {
	console.log('Mark\'s Family paid a greater tip of $' + mark.average);
}else {
	console.log('Both Familypaid the same tip which is $' + john.average);
}