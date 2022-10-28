from flask import Flask, request, jsonify
from flask_cors import CORS
from datetime import datetime
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)
CORS(app)
app.config["SQLALCHEMY_DATABASE_URI"] = 'mysql+pymysql://utpalpatel0055:toor0073@utpalpatel0055.mysql.pythonanywhere-services.com/utpalpatel0055$iws-hw3'
app.config["SQLALCHEMY_TRACK_MODIFICATIONS"] = False

db = SQLAlchemy(app)


class User1_info(db.Model):
    _tablename_ = "user1"

    id = db.Column(db.Integer, primary_key=True)
    resumepath = db.Column(db.String(50), nullable=True)
    firstname = db.Column(db.String(30), nullable=True)
    lastname = db.Column(db.String(30), nullable=True)
    degree = db.Column(db.String(50), nullable=True)
    phone = db.Column(db.Numeric, nullable=True)
    email = db.Column(db.String(30), nullable=True)
    gender = db.Column(db.String(30), nullable=True)
    bod = db.Column(db.DateTime, nullable=True)
    birthplace = db.Column(db.String(30), nullable=True)
    currentloc = db.Column(db.String(30), nullable=True)
    futureloc = db.Column(db.String(30), nullable=True)
    noofsib = db.Column(db.Integer, nullable=True)
    hobbies = db.Column(db.String(30), nullable=True)
    othercol = db.Column(db.String(30), nullable=True)

@app.route("/")
def index():
    return "OK Google"

@app.route("/a", methods=['POST'])
def index2():
    firstname = request.json.get("firstname");
    lastname = request.json.get("lastname");
    degree = request.json.get("degree");
    phone = request.json.get("phone");
    email = request.json.get("email");
    gender = request.json.get("gender");
    bod = request.json.get("bod");
    birthplace = request.json.get("birthplace");
    currentloc = request.json.get("currentloc");
    futureloc = request.json.get("futureloc");
    noofsib = request.json.get("noofsib");
    hobbies = request.json.get("hobbies");

    comment = User1_info(firstname=firstname,
                        lastname=lastname,
                        degree=degree,
                        phone=phone,
                        email=email,
                        gender=gender,
                        bod=bod,
                        birthplace=birthplace,
                        currentloc=currentloc,
                        futureloc=futureloc,
                        noofsib=noofsib,
                        hobbies=hobbies)

    db.session.add(comment)
    db.session.commit()
    return jsonify({"status": True, "message": "Data inserted Successfully!"}), 200

if __name__ == "_main_":
    app.config["DEBUG"] = True
    app.run()
