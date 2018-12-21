<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">

    <title>Owners</title>
</head>

<body>

<#include "partials/ownersNavbar.ftl">

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <#include "partials/sidebar.ftl">
        </div>


        <form action="/admin/owners/search" class="navbar-form navbar-right" id="searchOwnerForm" name="searchOwnerForm"
              style="margin-left:37%; float: none!important;">
        </form>


        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <#if owners??>
                <h1 class="page-header">Owners</h1>

                <table class="table table-striped">
                <thead>
                <tr>

                    <th>Tax Registration Number</th>
                    <th>FirstName</th>
                    <th>LastName</th>
                    <th>Address</th>
                    <th>Email</th>
                    <th>Car Brand</th>
                    <th>Car Plate</th>
                    <th>User Type</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>

                <#list owners as owner>
                    <tr>

                    <td> ${owner.taxRegistrationNumber}</td>
                    <td> ${owner.firstName}</td>
                    <td> ${owner.lastName}</td>
                    <td> ${owner.address}</td>
                    <td> ${owner.email}</td>
                    <td> ${owner.carBrand}</td>
                    <td> ${owner.carPlate}</td>
                    <td> ${owner.userType}</td>

                    <td class="text-right">
                <a class="btn btn-success" href="/admin/owners/${owner.id}/edit">Edit</a>
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