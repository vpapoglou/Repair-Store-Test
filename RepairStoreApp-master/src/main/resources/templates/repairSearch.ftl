<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">

    <title>Repairs</title>
</head>

<body>

<#include "partials/repairsNavbar.ftl">

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <#include "partials/sidebar.ftl">
        </div>

        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <#if repairs??>
                <h1 class="page-header">Repairs</h1>

                <table class="table table-striped">
                <thead>
                <tr>

                    <th>Description</th>
                    <th>Repair Status</th>
                    <th>Repair Type</th>
                    <th>Service Cost</th>
                    <th>Plate Number</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>

                <#list repairs as repair>
                    <tr>

                    <td> ${repair.description}</td>

                    <td> ${repair.repairStatus}</td>
                    <td> ${repair.repairType}</td>
                    <td> ${repair.serviceCost}</td>
                    <td> ${repair.plateNumber}</td>

                    <td class="text-right">
                <a class="btn btn-success" ">Edit</a>
                    </td>
                    </tr>
                </#list>

                </tbody>
                </table>
            </#if>

        </div>


    </div>
</div>

<#include "partials/scripts.ftl">

</body>
</html>