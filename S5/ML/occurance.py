s=input("enter a string")
word=s.split()
occurance={}
for w in word:
	if w in occurance:
		occurance[w]=occurance[w]+1
	else:
		occurance[w]=1
print("word occured")
for w,count in occurance.items():
	print(w,":",count)

		
