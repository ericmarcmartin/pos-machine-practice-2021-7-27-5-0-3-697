**printReceipt**
<br/>
P - 5min
<br/>
D - 24min
<br/>
C - I analyzed the Context Map and refactored the ordering as I followed the context map
<br/>
A - Follow first the context map before creating methods
<br/>
<br/>
**convertToItems**
<br/>
P - 15min
<br/>
D - 47min
<br/>
C - I analyzed the entire Context Map again and had to decide how subtotal will be counted.
<br/>
A - If there are code difference with Context Map, analyze it first how methods will be implemented.
<br/>
<br/>
**loadAllItemsInfo**
<br/>
P - 3 mins
<br/>
D - approx 1 min
<br/>
C - I only have to update loadBarCodes() to align with the requirement that's why it can be done fast.
<br/>
A - Double check if data being used are aligned with requirement.
<br/>
<br/>
**calculateReceipt**
<br/>
P - 5min
<br/>
D - 2min
<br/>
C - calculateReceipt only returns totalPrice
<br/>
A - Use method to get the totalPrice
<br/>
<br/>
**calculateItemsSubtotal**
<br/>
P - 10min
<br/>
D - 16min
<br/>
C - I got blocked in how subTotal will be generated since it can be method, which is in my Context Map, and also directly
in convertToItems(). I took me minutes to decide to put it inside covertToItems() because it's cleaner and more efficient.
<br/>
A - Always follow the context map to avoid delays then refactor it in the next stories.
<br/>
<br/>
**calculateTotalPrice**
<br/>
P - 5min
<br/>
D - 3min
<br/>
C - 
<br/>
A - continue in doing the process inside calculateTotalPrice
<br/>
<br/>
**renderReceipt**
<br/>
P - 5min
<br/>
D - 2min
<br/>
C -
<br/>
A - continue in doing the process inside renderReceipt
<br/>
<br/>
**spliceItemsDetails**
<br/>
P - 5min
<br/>
D - 2min
<br/>
C - 
<br/>
A - continue in doing the process inside spliceItemsDetails
<br/>
<br/>
**spliceReceipt**
<br/>
P - 5min
<br/>
D - 5min
<br/>
C -
<br/>
A - continue in doing the process inside spliceReceipt
<br/>
<br/>

Comment: I noticed that the beginning of development it usually takes longer time because as a dev, there will be simulations and analyzations first before we start coding it. At the corresponding development, it is much faster because the dev has already analyzed the method with the guide of Context Map.