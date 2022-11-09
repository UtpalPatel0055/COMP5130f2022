from flask import Blueprint

user = Blueprint("user", __name__, url_prefix="/api/v1/user")

@user.get('/')
def Users():
    return 'Hello'