<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">

    <title>Create Repair</title>
</head>

<body>
<#include "partials/navbar.ftl">
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <#include "partials/sidebar.ftl">
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <form class="form-horizontal" action="/admin/repairs" method="POST" name="repairForm" id="repairForm">
                <h1 class="page-header">Create Repair</h1>

                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="form-group">
                        <@spring.bind "repairForm.description"/>
                            <label for="productCode">Description</label>
                            <input type="text" class="form-control" name="description" id="description" placeholder="Enter description" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "repairForm.repairStatus"/>
                            <label for="productName">Repair Status</label>
                            <Select name="repairStatus" id="repairStatus"  placeholder="Enter Repair Status" required/>
                            <option value="To Do">To Do</option>
                            <option value="In Progress">In Progress</option>
                            <option value="Finished">Finished</option>
                            </select>
                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "repairForm.repairType"/>
                            <label for="productCode">Repair Type</label>
                            <select name="repairType" id="repairType"  placeholder="Enter repairType" required>
                                <option value="Small">Small</option>
                                <option value="Big">Big</option>
                            </select>
                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "repairForm.serviceCost"/>
                            <label for="productName">Service Cost</label>
                            <input type="text" class="form-control" name="serviceCost" id="serviceCost"  placeholder="Enter Service Cost"/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "repairForm.plateNumber"/>
                            <label for="productName">Car Plate</label>
                            <input type="text" class="form-control" name="plateNumber" id="plateNumber"  placeholder="Enter Car Plate" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "repairForm.id"/>
                            <label for="productCode">Owner ID</label>
                            <input type="text" class="form-control" name="id" id="id" placeholder="Enter a valid ID" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-success">Create</button>
                        <button type="reset" id="btn-clear" class="btn btn-danger">Reset</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>