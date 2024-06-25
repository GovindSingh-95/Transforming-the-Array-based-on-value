# Transforming-the-Array-based-on-value
<h2>Question Statement</h2>
<p>
  <br>Given an Array in a random order.We need to transform the Array on the basis of index,where the lowest element gets value of 0,and largest gets the value of n-1,where n is the size of the Array.<br>
  <br>For example->
  <br>Arr=[2,3,7,4,8,0]
  <br>So,the output should be.<br>
  Arr=[1,2,4,3,5,0]
  <br>Here as 0 is the smallest element it got lowest index i.e 0.Similarly,as 7 is the second Largest Element,it got index 4,cuz it is second largest index for this Array.
</p>
<h2>Algorithm</h2>
<p>
  <br>Here, declare variables like, idx=-1,max=arr[0].<br>
  <br>Here,the outer loop round have to take it from 0 to n-1.<br>
  <br>Here,we are trying to find the largest element from the Array and assign it Lowest element of the Integer,so that we other elements can also be given chance to be changed.<br>
  <br>But,if all the elements are given same value of Integer.MIN_VALUE, then how to differentiate between them.<br>
  <br>So,for differntiation we can add the value of round,while assigning the value of Integer.MIN_VALUE to the largest element<br>
  <br>Basically, take for loop int i from 0 to n-1,and compare it with max, and if(arr[i]>=max) give idx=i.After this pass is over.Do arr[idx]=Integer.MIN_VALUE+round.<br>
  <br>Now outside of outer loop, make another for loop from 0 to n-1.<br>
  <br>As,value stored in each element is different,such that largest element got smallest value and smallest got largest value.<br>
  <br>Now,to assign the desired index value to the desired place.Subtract Integer.MIN_VALUE from each element.But as stated earlier,It will result lagrgest value of Array to get 0,while smallest get n-1.<br>
  <br>Now,to make it proper just do,arr[i]=n-1-arr[i].<br>
  <br>Thus,you got your required Array.<br>
  <br>One Important thing,the max variable should always be initialised to arr[0] inside outer loop but before inner loop.Otherwise,only largest element will be converted to Integer.MIN_VALUE+round,and rest will remain unaffected.<br>
</p>
