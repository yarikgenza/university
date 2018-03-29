const arr = [8, 4, 6, 7, 5];

for (j = 0; j < arr.length; j++) {
  for (i = 0; i <arr.length; i++) {
    if (arr[i] > arr[i+1]) {
      let tr = arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=tr;
    };
  };
};


console.log(arr);