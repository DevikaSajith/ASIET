echo "enter the number"
read n
 temp=$n
 reverse=0
 while [ $temp -gt 0 ]
 do
  digit=$(($temp%10))
  reverse=$(($reverse*10+$digit))
  temp=$(($temp/10))
 done
if [ $n -eq $reverse ]
then
echo "it is palindrome"
else
echo "it is not palindrome"
fi
 
