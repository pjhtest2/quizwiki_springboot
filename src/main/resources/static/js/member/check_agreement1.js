//고등학생용 회원가입 양식으로 넘어가는 자바스크립트
function next_signup()  {
	
  // 전체 체크박스
  const checkboxes 
    = document.querySelectorAll('input[name="agreement"]');
  // 선택된 체크박스
  const checked 
    = document.querySelectorAll('input[name="agreement"]:checked');
 
  if(checkboxes.length === checked.length)  {
      location.href='/signup1'

  }
  
}

