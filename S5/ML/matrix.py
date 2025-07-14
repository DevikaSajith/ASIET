r1=int(input("enter number of rows in matrix1"))
c1=int(input("enter number of  cols in matrix1"))
r2=int(input("enter number of rows in matrix2"))
c2 =int(input("enter number of rows in matrix2"))
if r1!=c2:
	print("not possible")
else:
	print("enter  matrix A")
	A=[]
	for i in range(r1):
		row=list(map(int ,input().split()))
		A.append(row)
	print("enter matrix B")
	B=[]
	for i in range(r2):
		row=list(map(int, input().split()))
		B.append(row)
	result = []
	for i in range(r1):
		row=[]
		for j in range(c2):
			s=0
			for k in range(c1):
				s+=A[i][k] * B[k][j]
			row.append(s)
		result.append(row)
	print("result")
	for row in result:
		print(*row)
    
		

