<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<!-- cdn -->
    <script src="https://kit.fontawesome.com/e92cf22849.js" crossorigin="anonymous"></script>
    

    <!-- CSS -->
    <link rel="stylesheet" type="text/css" href="./css/common.css"/>
    <link rel="stylesheet" type="text/css" href="./css/main.css"/>

    <!-- js -->
    <script src="./js/tab_style/modernizr.custom.js"></script>
<title>Quiz Wiki</title>
</head>
<body>

    <!-- main page -->
        <section id="main-banner-section">
            <div class="slide-deco">
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M563-58 395-226l60-61 108 108 230-231 60 61L563-58ZM108-312l203-525h88l202 525h-89l-53-139H240l-52 139h-80Zm152-203h180l-88-242h-5l-87 242Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M441-71v-181L301-113l-57-56 197-196v-76h-76L173-248l-58-55 136-138H71v-79h180L112-660l57-57 196 197h76v-77L248-788l56-58 137 137v-180h79v180l140-140 56 57-196 195v77h77l192-193 57 56-136 137h179v79H710l137 140-55 57-195-197h-77v76l196 197-55 57-141-141v181h-79Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M803-101 528-375l68-70 276 275-69 69Zm-592-59q-63-68-93-148.5T88-470q0-81 30-158t90-137q61-60 136.5-89.5T502-884q80 0 161 30t148 93L211-160Zm8-140 68-67q-16-22-30.5-45.5T230-462q-12-26-20-54t-10-58q-27 69-19.5 140.5T219-300Zm113-111 230-231q-42-31-87-50t-83.5-26q-38.5-7-70.5-1.5T271-696q-18 19-22.5 49t2.5 69q7 39 28 81.5t53 85.5Zm273-275 69-68q-62-37-133.5-41T397-773q29 4 56.5 11t53.5 19.5q26 12.5 50.5 27T605-686Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M479.588-111q-155.358 0-261.973-106.85Q111-324.701 111-480.059t106.833-263.149Q324.667-851 480-851q6.707 0 13.854.5Q501-850 514-849q-29 36-44 78.5T455-682q0 96.417 66.083 162.208Q587.167-454 683-454q46.891 0 89.946-13Q816-480 851-507q-1 11.975-.5 17.195.5 5.22.5 8.72 0 155.168-108.277 262.627Q634.446-111 479.588-111Zm.412-91q90 0 160-53t91-126q-19 8-42.167 11.5Q665.667-366 645-367q-109.612-13-186.806-88.486Q381-530.973 367-647q-1-15.333 2-36.667Q372-705 382-734q-79 30-129.5 100.5T202-480q0 117.086 80.457 197.543Q362.914-202 480-202Zm-13-266Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M760-583 577-765l61-63q27-27 65-27t65 27l54 54q27 27 27 65t-27 65l-62 61ZM94-100v-186l187-187L59-693l202-205 224 223 92-90 183 182-91 92 224 221L688-67 467-288 279-100H94Zm243-428 92-91-67-66-48 48-43-43 49-48-57-58-91 93 165 165Zm350 350 90-91-56-57-49 49-42-44 48-48-66-66-91 92 166 165Zm-513-2h71l400-401-70-71-401 400v72Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M112-59v-74h100v-23h-60v-60h60v-23H112v-74h126.838q19.412 0 33.287 13.875T286-266v33q0 19.975-13.875 33.488Q258.25-186 239-186q19.25 0 33.125 13.875T286-139v33q0 19.975-13.875 33.487Q258.25-59 238.838-59H112Zm0-295v-110q0-18.1 13.512-32.05Q139.025-510 159-510h53v-24H112v-74h126.838q19.412 0 33.287 13.8T286-560v62q0 20.4-13.875 34.2Q258.25-450 239-450h-53v22h100v74H112Zm60-295v-186h-60v-68h134v254h-74Zm203 455v-91h487v91H375Zm0-242v-91h487v91H375Zm0-243v-91h487v91H375Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M322-128q-37.175 0-64.087-27.206Q231-182.413 231-220v-105h132v-129q-35 0-71.5-13.5t-65.222-40.88V-564H179L44-700q40-33 91-56.5T238-780q26 0 61.5 9.5T363-742v-91h500v577q0 53.25-37.875 90.625T735-128H322Zm132-197h245v69q0 17 9.307 26.5t26 9.5Q751-220 761-229.5t10-26.5v-485H454v62l213 213v50h-49L507-530l-14 17q-10.129 11.667-19.379 17.69-9.25 6.024-19.621 11.31v159ZM209-632h85v90q13.895 10.714 30.072 15.857Q340.25-521 357.108-521 381-521 405-535q24-14 34.385-23.692L455-577l-64.953-65.953Q357.183-676 319.169-694T238-712q-26.214 0-46.107 6.5T153-688.75L209-632Zm399.064 375H322v37h300q-7-4-10.468-14t-3.468-23ZM322-220v-37 37Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M478-23 292-399q-78 12-135.5-37.96T99-568q0-52.165 33-102.083Q165-720 223-734q21-94 94.071-149 73.07-55 162-55Q570-938 642.5-883.5T737-735q58 14 91.5 64.543Q862-619.913 862-567.591q0 79.149-60.5 129.87Q741-387 669-399L478-23ZM265.666-487q15.593 0 31.265-5 15.673-5 22.305-12l33.811-37 25.777 27q22.82 18 52.109 22.5Q460.223-487 483-487t48.567-4.5q25.789-4.5 49.609-22.5l25.777-27 32.811 37q7.183 7.364 22.701 12.182Q677.983-487 692.933-487q30.204 0 53.636-24.836Q770-536.672 770-567.239q0-27.023-17.283-47.99-17.284-20.967-46.942-25.914l-52.653-5.139.357-29.115q-8.028-74.254-54.315-122.928Q552.876-847 480.438-847t-119.632 48.718q-47.193 48.718-54.26 123.034l-.597 29.051L254-638q-25.882 5.298-44.941 24.841Q190-593.615 190-566.81q0 30.398 23.363 55.104T265.666-487ZM478-209l103-200-6-6q-22 10-47.5 14.5t-44.605 4.5q-22.895 0-50.228-4.5Q405.333-405 386-415l-6 5 98 201Zm2-457Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M150-178q-37.05 0-64.025-26Q59-230 59-267v-504q0-36.463 27.475-64.731Q113.95-864 152-863l72 149h130l-72-149h88l72 149h131l-73-149h89l72 149h130l-72-149h91q37.463 0 64.731 27.769Q902-807.463 902-771v205h-92v-56H150v353h349v91H150Zm574-250 40 38-148 149.143V-194h45.67L810-343l41 39-167 165H559v-124l165-165Zm127 124L724-428l62-61q12-14 31-14t33 14l61 59q12 14 12 33t-12 32l-60 61Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M479-116 182-277v-236L25-598l454-248 456 248v323h-80v-277l-78 39v236L479-116Zm0-325 286-157-286-154-284 154 284 157Zm0 235 217-119.749V-465L479-351 262-467v141.251L479-206Zm1-235Zm-1 80Zm0 0Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M211-101q-46 0-78-32t-32-78v-523q0-51 49-71t86 17l41 41-51 52 29 29 51-52 114 114-52 52 29 29 52-52 115 115-52 52 29 29 52-52 114 114-52 51 29 29 51-52 42 42q40 40 19 93t-75 53H211Zm1-111h424L212-636v424Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="m503-266 355-355-65-64-354 355 64 64Zm-284 67q-104-7-153.5-46T16-349q0-62 50-101.5T208-504q50-6 69-16t19-27q0-24-31-38.5T169-607l7-82q98 9 151 45.5t53 96.5q0 48-40 80.5T228-422q-63 8-95.5 26.5T100-348q0 29 30.5 45t92.5 20l-4 84Zm310 26L344-357l405-403q20-20 45-19.5t45 19.5l94 94q19 20 19 45.5T933-575L529-173Zm-163 34q-24 6-42-12t-14-42l34-164 185 184-163 34Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M805-579v-96q0-23 14-36.5t37-13.5h80v-45H805v-51h131q23 0 37 14t14 37v45q0 24-14 37t-37 13h-80v45h131v51H805ZM201-136l201-316-187-293h122l135 211h-2l132-211h123L537-452l202 316H616L470-369h2L323-136H201Z"/></svg>
                
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M563-58 395-226l60-61 108 108 230-231 60 61L563-58ZM108-312l203-525h88l202 525h-89l-53-139H240l-52 139h-80Zm152-203h180l-88-242h-5l-87 242Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M441-71v-181L301-113l-57-56 197-196v-76h-76L173-248l-58-55 136-138H71v-79h180L112-660l57-57 196 197h76v-77L248-788l56-58 137 137v-180h79v180l140-140 56 57-196 195v77h77l192-193 57 56-136 137h179v79H710l137 140-55 57-195-197h-77v76l196 197-55 57-141-141v181h-79Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M803-101 528-375l68-70 276 275-69 69Zm-592-59q-63-68-93-148.5T88-470q0-81 30-158t90-137q61-60 136.5-89.5T502-884q80 0 161 30t148 93L211-160Zm8-140 68-67q-16-22-30.5-45.5T230-462q-12-26-20-54t-10-58q-27 69-19.5 140.5T219-300Zm113-111 230-231q-42-31-87-50t-83.5-26q-38.5-7-70.5-1.5T271-696q-18 19-22.5 49t2.5 69q7 39 28 81.5t53 85.5Zm273-275 69-68q-62-37-133.5-41T397-773q29 4 56.5 11t53.5 19.5q26 12.5 50.5 27T605-686Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M479.588-111q-155.358 0-261.973-106.85Q111-324.701 111-480.059t106.833-263.149Q324.667-851 480-851q6.707 0 13.854.5Q501-850 514-849q-29 36-44 78.5T455-682q0 96.417 66.083 162.208Q587.167-454 683-454q46.891 0 89.946-13Q816-480 851-507q-1 11.975-.5 17.195.5 5.22.5 8.72 0 155.168-108.277 262.627Q634.446-111 479.588-111Zm.412-91q90 0 160-53t91-126q-19 8-42.167 11.5Q665.667-366 645-367q-109.612-13-186.806-88.486Q381-530.973 367-647q-1-15.333 2-36.667Q372-705 382-734q-79 30-129.5 100.5T202-480q0 117.086 80.457 197.543Q362.914-202 480-202Zm-13-266Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M760-583 577-765l61-63q27-27 65-27t65 27l54 54q27 27 27 65t-27 65l-62 61ZM94-100v-186l187-187L59-693l202-205 224 223 92-90 183 182-91 92 224 221L688-67 467-288 279-100H94Zm243-428 92-91-67-66-48 48-43-43 49-48-57-58-91 93 165 165Zm350 350 90-91-56-57-49 49-42-44 48-48-66-66-91 92 166 165Zm-513-2h71l400-401-70-71-401 400v72Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M112-59v-74h100v-23h-60v-60h60v-23H112v-74h126.838q19.412 0 33.287 13.875T286-266v33q0 19.975-13.875 33.488Q258.25-186 239-186q19.25 0 33.125 13.875T286-139v33q0 19.975-13.875 33.487Q258.25-59 238.838-59H112Zm0-295v-110q0-18.1 13.512-32.05Q139.025-510 159-510h53v-24H112v-74h126.838q19.412 0 33.287 13.8T286-560v62q0 20.4-13.875 34.2Q258.25-450 239-450h-53v22h100v74H112Zm60-295v-186h-60v-68h134v254h-74Zm203 455v-91h487v91H375Zm0-242v-91h487v91H375Zm0-243v-91h487v91H375Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M322-128q-37.175 0-64.087-27.206Q231-182.413 231-220v-105h132v-129q-35 0-71.5-13.5t-65.222-40.88V-564H179L44-700q40-33 91-56.5T238-780q26 0 61.5 9.5T363-742v-91h500v577q0 53.25-37.875 90.625T735-128H322Zm132-197h245v69q0 17 9.307 26.5t26 9.5Q751-220 761-229.5t10-26.5v-485H454v62l213 213v50h-49L507-530l-14 17q-10.129 11.667-19.379 17.69-9.25 6.024-19.621 11.31v159ZM209-632h85v90q13.895 10.714 30.072 15.857Q340.25-521 357.108-521 381-521 405-535q24-14 34.385-23.692L455-577l-64.953-65.953Q357.183-676 319.169-694T238-712q-26.214 0-46.107 6.5T153-688.75L209-632Zm399.064 375H322v37h300q-7-4-10.468-14t-3.468-23ZM322-220v-37 37Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M478-23 292-399q-78 12-135.5-37.96T99-568q0-52.165 33-102.083Q165-720 223-734q21-94 94.071-149 73.07-55 162-55Q570-938 642.5-883.5T737-735q58 14 91.5 64.543Q862-619.913 862-567.591q0 79.149-60.5 129.87Q741-387 669-399L478-23ZM265.666-487q15.593 0 31.265-5 15.673-5 22.305-12l33.811-37 25.777 27q22.82 18 52.109 22.5Q460.223-487 483-487t48.567-4.5q25.789-4.5 49.609-22.5l25.777-27 32.811 37q7.183 7.364 22.701 12.182Q677.983-487 692.933-487q30.204 0 53.636-24.836Q770-536.672 770-567.239q0-27.023-17.283-47.99-17.284-20.967-46.942-25.914l-52.653-5.139.357-29.115q-8.028-74.254-54.315-122.928Q552.876-847 480.438-847t-119.632 48.718q-47.193 48.718-54.26 123.034l-.597 29.051L254-638q-25.882 5.298-44.941 24.841Q190-593.615 190-566.81q0 30.398 23.363 55.104T265.666-487ZM478-209l103-200-6-6q-22 10-47.5 14.5t-44.605 4.5q-22.895 0-50.228-4.5Q405.333-405 386-415l-6 5 98 201Zm2-457Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M150-178q-37.05 0-64.025-26Q59-230 59-267v-504q0-36.463 27.475-64.731Q113.95-864 152-863l72 149h130l-72-149h88l72 149h131l-73-149h89l72 149h130l-72-149h91q37.463 0 64.731 27.769Q902-807.463 902-771v205h-92v-56H150v353h349v91H150Zm574-250 40 38-148 149.143V-194h45.67L810-343l41 39-167 165H559v-124l165-165Zm127 124L724-428l62-61q12-14 31-14t33 14l61 59q12 14 12 33t-12 32l-60 61Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M479-116 182-277v-236L25-598l454-248 456 248v323h-80v-277l-78 39v236L479-116Zm0-325 286-157-286-154-284 154 284 157Zm0 235 217-119.749V-465L479-351 262-467v141.251L479-206Zm1-235Zm-1 80Zm0 0Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="M211-101q-46 0-78-32t-32-78v-523q0-51 49-71t86 17l41 41-51 52 29 29 51-52 114 114-52 52 29 29 52-52 115 115-52 52 29 29 52-52 114 114-52 51 29 29 51-52 42 42q40 40 19 93t-75 53H211Zm1-111h424L212-636v424Z"/></svg>
                <svg class="breath-effect" xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 -960 960 960" width="48"><path d="m503-266 355-355-65-64-354 355 64 64Zm-284 67q-104-7-153.5-46T16-349q0-62 50-101.5T208-504q50-6 69-16t19-27q0-24-31-38.5T169-607l7-82q98 9 151 45.5t53 96.5q0 48-40 80.5T228-422q-63 8-95.5 26.5T100-348q0 29 30.5 45t92.5 20l-4 84Zm310 26L344-357l405-403q20-20 45-19.5t45 19.5l94 94q19 20 19 45.5T933-575L529-173Zm-163 34q-24 6-42-12t-14-42l34-164 185 184-163 34Z"/></svg>
            </div>
            <div id="main-banner-container">
                <div id="main-banner-title">
                    <h4>함께 성장하는 모두의 공부 커뮤니티</h4>
                    <h1>Quiz Wiki</h1>
                </div>
    
                <div class="tabs tabs-style-shape tab-custom">
                    <nav>
                        <ul>
                            <li>
                                <a href="#section-shape-1">
                                    <span class="tab-title">나만의 문제집</span>
                                </a>
                            </li>
                            <li>
                                <a href="#section-shape-2">
                                    <span class="tab-title">질문게시판</span>
                                </a>
                            </li>
                            <li>
                                <a href="#section-shape-3">
                                    <span class="tab-title">오답노트</span>
                                </a>
                            </li>
                            <li>
                                <a href="#section-shape-4">
                                    <span class="tab-title">학습관리</span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                    <div class="content-wrap">
                        <section id="section-shape-1"><p>나만의 문제집</p></section>
                        <section id="section-shape-2"><p>질문게시판</p></section>
                        <section id="section-shape-3"><p>오답노트</p></section>
                        <section id="section-shape-4"><p>학습관리</p></section>
                    </div><!-- /content -->
                </div><!-- /tabs -->
            </div>
            
        </section>

        <section id="main-desc-section">
            <div class="desc-container">
                <h2>
                    <i class="fa-sharp fa-solid fa-feather"></i>
                    나만의 문제집
                </h2>
                <h4>
                    나만의 문제를 만들고, 다른사람들과 공유 해보세요!
                </h4>
                <div class="desc-card">
                </div>

                <h2>
                    <i class="fa-sharp fa-solid fa-feather"></i>
                    멘토 게시판 (질문 게시판)
                </h2>
                <h4>
                    다른 사람의 멘토가 되어 알려주거나, 멘토를 찾아보세요!
                </h4>
                <div class="desc-card">
                </div>

                <h2>
                    <i class="fa-sharp fa-solid fa-feather"></i>
                    오답노트
                </h2>
                <h4>
                    틀린 문제를 다시 복습해보세요.
                </h4>
                <div class="desc-card">
                </div>

                <h2>
                    <i class="fa-sharp fa-solid fa-feather"></i>
                    학습관리
                </h2>
                <h4>
                    내 학습 현황을 확인하고, 맞춤형 추천 컨텐츠를 받아보세요.
                </h4>
                <div class="desc-card">
                </div>
            </div>
        </section>
    <!-- main page end -->


    <!-- tab js -->
    <script src="js/tab_style/cbpFWTabs.js"></script>
    <script>
        (function() {

            [].slice.call( document.querySelectorAll( '.tabs' ) ).forEach( function( el ) {
                new CBPFWTabs( el );
            });

        })();
    </script>
    <!-- tab js end -->
</body>
</html>