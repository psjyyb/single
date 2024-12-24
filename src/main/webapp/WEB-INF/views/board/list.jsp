<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2024-12-13
  Time: 오전 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<main class="mt-5 pt-5">
  <div class="container-fluid px-4">
    <div class="nav">
      <h1 class="mt-4">게시판리스트</h1>
      <button type="button" id="logout" class="btn btn-secondary float-end" href="/logout.do"> <i
              class="fas fa-edit"></i> 로그아웃
      </button>
    </div>
    <div class="card mb-4">
      <div class="card-header">


        </a>
      </div>
      <div class="card-body">
        <div class="top-container">
          <div class="count-display">
<%--            <span>총</span><span>${totalCount}개</span>--%>
          </div>
        </div>
        <div id="surveyListConatiner">
          <table class="table table-hover table-striped">
            <thead>
            <tr>
              <th>순번</th>
              <th>제목</th>
              <th>내용</th>
              <th>작성일</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach items="${boardList}" var="board" varStatus="status">
              <tr>
                <td>${board.boardNo}</td>
                <td>${board.boardTitle}</td>
                <td>${board.boardContent}</td>
                <td>${board.boardDt}</td>
              </tr>
            </c:forEach>
            </tbody>
          </table>
        </div>

      </div>
    </div>
  </div>

</main>
</body>
</html>
