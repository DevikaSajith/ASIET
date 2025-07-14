import pandas as pd
import matplotlib.pyplot as plt
data={'year':[2015,2016,2017,2018,2019,2020],'sales':[200,250,300,400,500,600]}
df=pd.DataFrame(data)
df.plot(x='year',y='sales',kind='line',title='yearly sales')
plt.show()
df.plot(x='year',y='sales',kind='bar',title='yearly sales')
plt.show()
df.plot(x='year',y='sales',kind='pie',title='yearly sales')
plt.show()



