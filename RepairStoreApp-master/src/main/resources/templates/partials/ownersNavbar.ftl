<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button aria-controls="navbar" aria-expanded="false" class="navbar-toggle collapsed" data-target="#navbar"
                    data-toggle="collapse" type="button">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/admin">Admin Home</a>
        </div>
        <div class="navbar-collapse collapse" id="navbar">

            <ul class="nav navbar-nav navbar-right">
                <li><a href="/admin">Home</a></li>
                <li><a href="/admin/owners">Owners</a></li>
                <li><a href="/admin/repairs">Repairs</a></li>
                <#include "ownerSearch.ftl">
            </ul>



        </div>
    </div>
</nav>