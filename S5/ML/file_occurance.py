with open("input.txt","r") as f:
	str=f.read()
str=str.split()
dict={}
for st in str:
	if st in dict:
		dict[st]+=1
	else:
		dict[st]=1
hind=int(-1)
for word,value in dict.items():
	if(value>hind):
		high=word
		hind=value
print(f"The most frequent word is{high} with occurance {dict[high]} ")
	
