from flask import Blueprint, request, jsonify
from src.models.user import User as UserModel

user = Blueprint("user", __name__, url_prefix="/api/v1/user")

@user.get('/')
def Users():
    return 'Hello'

@user.post("/signup")
def SignUp():
    email = request.json.get("email")
    if UserModel.get_by_email(email=email) is not None:
        return jsonify({"status": False, "message": "Email is already registered with us",  "tag": "danger"}), HTTP_409_CONFLICT
    user = UserModel(email=email)
    user.save()
    #RegisterMaillable.send_mail(email, user.id)
    return jsonify({"message": "New user created", "status": True}), 201
