# Matrix Multiplication
r1 = int(input("Enter number of rows in first matrix: "))
c1 = int(input("Enter number of columns in first matrix: "))
r2 = int(input("Enter number of rows in second matrix: "))
c2 = int(input("Enter number of columns in second matrix: "))
if c1 != r2:
    print("Matrix can't be multiplied.")
else:
    print("Enter Matrix A:")
    A = []
    for i in range(r1):
        row = list(map(int, input().split()))
        A.append(row)

    print("Enter Matrix B:")
    B = []
    for i in range(r2):
        row = list(map(int, input().split()))
        B.append(row)
    result = []
    for i in range(r1):
        row = []
        for j in range(c2):
            s = 0
            for k in range(c1):
                s += A[i][k] * B[k][j]
            row.append(s)
        result.append(row)
    print("Result:")
    for row in result:
        print(*row)
