import numpy as np
##dt = np.dtype([('day number', int), ('steps walked', int)])
arr1=np.array([6012,5636,3245,9023,5624,2345,9012,2345,3456,1234])
arr2=np.arange(1,11,1)
arr3=np.column_stack((arr2,arr1))
print(arr3)
print(arr1)
arr3[:,1]+=2000
print(arr3)
arr4=np.sorted(arr3)
print(arr4)

