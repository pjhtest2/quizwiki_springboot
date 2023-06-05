function next_signup()  {
	
  // 전체 체크박스
  const checkboxes 
    = document.querySelectorAll('input[name="agreement"]');
  // 선택된 체크박스
  const checked 
    = document.querySelectorAll('input[name="agreement"]:checked');
 
  if(checkboxes.length === checked.length)  {
      location.href='/signup.do'

  }
  
//  if(checkboxes.length === checked.length)  {
//  console.log(checkboxes.length);
//  console.log(checked.length);
//  location.href='/signup.do'
//	  return;
//    
//  }
  

}

