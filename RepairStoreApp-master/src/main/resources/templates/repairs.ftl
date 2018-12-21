<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">
    <title>Admin|Repairs</title>
</head>

<body>

<#include "partials/repairsNavbar.ftl">

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <#include "partials/sidebar.ftl">
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

            <#include "content/repairs.ftl">

            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <a class="btn pull-right" href="/admin/repairs/create">Create New Repair</a>
            </div>
        </div>
    </div>
</div>

<#include "partials/scripts.ftl">

</body>
</html>