from flask_sqlalchemy import SQLAlchemy
import os

db = SQLAlchemy()

def MIGRATE_DB(db):
    if os.environ.get("MIGRATE_DB").lower() in ("true"):
        print("Migrating tables at: ", db)
        db.create_all()
        print("done")