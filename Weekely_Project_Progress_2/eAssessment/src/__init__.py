from flask import Flask
import os
from src.controllers.user import user
from src.models import db, MIGRATE_DB

def create_app():

    app = Flask(__name__, instance_relative_config=True)

    app.config.from_mapping(
        SECRET_KEY=os.environ.get("SECRET_KEY"),
        SQLALCHEMY_DATABASE_URI = os.environ.get("SQLALCHEMY_DATABASE_URI"),
        SQLALCHEMY_TRACK_MODIFICATIONS = False
    )
    print(os.environ.get("SQLALCHEMY_DATABASE_URI"))
    with app.app_context():
        db.app = app
        db.init_app(app)
        MIGRATE_DB(db=db)

    app.register_blueprint(user)
    return app

