<?php

#This is a single line PHP comment
//This is also a single line PHP Comment
/*
This
is a
multiline PHP
comment
*/

echo "1.Assignment Operators <br> <br>";

$age_sam = 23;
$age_ann = $age_sam;
$age_john = $age_ann + 15;

echo $age_sam . "<br>";
echo $age_ann . "<br>";
echo $age_john. "<br> <br> <br>";


print "2.Arithmetic Operators"  . "<br>" . "<br>";

echo 5 + 4 * 10 . "<br>"; // 0utputs: 45
echo (5 + 4) * 10 . "<br>"; // 0utputs: 90
echo 5 + 4 * 10 / 2 . "<br>"; // 0utputs: 25
echo 8 * 10 / 4 - 2  . "<br>"; // 0utputs: 18
echo 8 * 10 / (4 - 2) . "<br>"; // 0utputs: 40
echo 8 + 10 / 4 - 2  . "<br>"; // 0utputs: 8.5

$x = 10;
$y = 4;
echo($x + $y) . "<br>"; // 0utputs: 14
echo($x - $y) . "<br>"; // 0utputs: 6
echo($x * $y) . "<br>"; // 0utputs: 40
echo($x / $y) . "<br>"; // 0utputs: 2.5
echo($x % $y) . "<br> <br> <br>"; // 0utputs: 2


print "3.String Operators"  . "<br>" . "<br>";

$x = "Hello";
$y = " World!";
echo $x . $y . "<br>"; // Outputs: Hello World!

$x .= $y;
echo $x . "<br> <br> <br>";


print "3.Comparison Operators"  . "<br>" . "<br>";

$x = 25;
$y = 35;
$z = "25";
var_dump($x == $z); // Outputs: boolean true
echo "<br>";
var_dump($x === $z); // Outputs: boolean false
echo "<br>";
var_dump($x != $y); // Outputs: boolean true
echo "<br>";
var_dump($x !== $z); // Outputs: boolean true
echo "<br>";
var_dump($x < $y); // Outputs: boolean true
echo "<br>";
var_dump($x > $y); // Outputs: boolean false
echo "<br>";
var_dump($x <= $y); // Outputs: boolean true
echo "<br>";
var_dump($x >= $y); // Outputs: boolean false
echo "<br> <br> <br>";


print "4.Arithmetic and Assignment Operators"  . "<br>" . "<br>";

$x = 125;
echo $x . "<br>"; // Outputs: 125
$x = 50;
$x /= 10;
echo $x. "<br>"; // Outputs: 5
$x = 100;
$x %= 15;
echo $x. "<br> <br> <br>"; // Outputs: 10


print "5.Logical Operators" . "<br>" . "<br>";

$year = 2016;
// Leap years are divisible by 400 or by 4 but not 100
if(($year % 400 == 0) || (($year % 100 != 0) &&
        ($year % 4 == 0))){
    echo "$year is a leap year.";
} else{
    echo "$year is not a leap year.";
}


print "6.Pre/Post-Increment and Pre/Post-Decrement" . "<br>" . "<br>";

$x = 10;
echo ++$x . "<br>"; // Outputs: 11
echo $x . "<br>"; // Outputs: 11
$x = 10;
echo $x++ . "<br>"; // Outputs: 10
echo $x . "<br>"; // Outputs: 11
$x = 10;
echo --$x . "<br>"; // Outputs: 9
echo $x . "<br>"; // Outputs: 9
$x = 10;
echo $x-- . "<br>"; // Outputs: 10
echo $x . "<br> <br> <br>"; // Outputs: 9


print "7.PHP Spaceship Operator(combined comparison operator)" . "<br>" . "<br>";

echo "The spaceship operator returns 0 if both operands are equal, 
1 if the left is greater, and -1 if the right is greater." . "<br>" . "<br>";

// Comparing Integers
echo 1 <=> 1; // Outputs: 0
echo "<br>";
echo 1 <=> 2; // Outputs: -1
echo "<br>";
echo 2 <=> 1; // Outputs: 1
echo "<br>";
// Comparing Floats
echo 1.5 <=> 1.5; // Outputs: 0
echo "<br>";
echo 1.5 <=> 2.5; // Outputs: -1
echo "<br>";
echo 2.5 <=> 1.5; // Outputs: 1
echo "<br>";
// Comparing Strings
echo "x" <=> "x"; // Outputs: 0
echo "<br>";
echo "x" <=> "y"; // Outputs: -1
echo "<br>";
echo "y" <=> "x"; // Outputs: 1
echo "<br> <br> <br>";


print "8.MATH Functions" . "<br>" . "<br>";

echo abs(-5) . "<br>"; // 0utputs: 5 (integer)
echo abs(4.2) . "<br>"; // 0utputs: 4.2 (double/float)
echo abs(-4.2) . "<br>"; // 0utputs: 4.2 (double/float)// Comparing Floats
// Round fractions up
echo ceil(4.2) . "<br>"; // 0utputs: 5
echo ceil(9.99) . "<br>"; // 0utputs: 10
echo ceil(-5.18) . "<br>"; // 0utputs: -5
// Round fractions down
echo floor(4.2) . "<br>"; // 0utputs: 4
echo floor(9.99) . "<br>"; // 0utputs: 9
echo floor(-5.18) . "<br>"; // 0utputs: -6
// Square root of a number
echo sqrt(25) . "<br>"; // 0utputs: 5
echo sqrt(10) . "<br>"; // 0utputs: 3.1622776601684
echo sqrt(-16) . "<br>"; // 0utputs: NAN
// Generate some random numbers
echo rand() . "<br>";
// Generate some random numbers between 1 and 10 (inclusive)
echo rand(1, 10) . "<br> <br> <br>";


print "9.Converting between data types" . "<br>" . "<br>";

$foo = "5bar"; // string
$bar = true;   // boolean

echo $foo . "<br>";
var_dump($foo);
echo "<br>";
echo $bar . "<br>";
var_dump($bar);
echo "<br>";

settype($foo, "integer"); // $foo is now 5   (integer)
settype($bar, "string");  // $bar is now "1" (string)
echo "<br>";

echo $foo . "<br>";
var_dump($foo);
echo "<br>";
echo $bar . "<br>";
var_dump($bar);
echo "<br>";


print "10.Escape Sequences" . "<br>" . "<br>";

echo "PHP Escape Sequences:\n Backslash \\ is used as an escaping 
character.";

?>