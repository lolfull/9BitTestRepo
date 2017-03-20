
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" href="${resource(dir: '../stylesheets', file: 'interface_style.css')}" type="text/css">
    <!--Load the AJAX API-->
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

</head>

<body>
<!--Wrapper for all template elements-->

<script type="text/javascript" src="../assets/dashboard.bundle.js"></script>

<div>
    <!--Title bar elements-->
    <div class="sidetitle"></div><div class="title">
    <h1>Budget Buddy </h1>
    </div>

    <!--Wrapper for all sidebar elements-->
    <div class="sidebar">

        <!--Profile picture box-->
        <div class="imgbox">
            <img> <!--Insert profile picture-->
        </div>

        <!--Sidebar Options-->
        <div class="selection">
            <p><a href="http://localhost:8080/dashboard" style="text-decoration:none">Dashboard</a></p>
            <p><a href="http://localhost:8080/transaction" style="text-decoration:none">Transactions</a></p>
            <p><a href="http://localhost:8080/achievements" style="text-decoration:none">Achievements</a></p>
            <p><a href="http://localhost:8080/settings" style="text-decoration:none">My Account</a></p>
            <p><a href="http://localhost:8080/login" style="text-decoration:none">Logout</a></p>
        </div>
    </div>
</div>

<!--Wrapper for all other dashboard elements-->
<div>

</div>
<!--Div that will hold the pie chart-->
<div id="chart_div" style="position:absolute; left:190px; top: 80px;">

</div>
<div id="barchart_div" style="position:absolute; left:790px; top: 80px;">

</div>
<div id="table_div" style="position:absolute; left:190px; top: 480px;">

</div>
<div id="table_div2" style="position:absolute; left:790px; top: 480px;">

</div>

</body>
</html>